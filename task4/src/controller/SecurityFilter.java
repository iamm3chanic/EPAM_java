package controller;

import domain.Role;
import domain.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

public class SecurityFilter implements Filter {
    private static final Map<String, Set<Role>> permissions = new HashMap<>();

    static {
        Set<Role> all = new HashSet<>();
        all.addAll(Arrays.asList(Role.values()));
        Set<Role> admin = new HashSet<>();
        admin.add(Role.ADMIN);
        Set<Role> users = new HashSet<>();
        users.add(Role.BOOKMAKER);
        users.add(Role.CLIENT);
        Set<Role> bookmaker = new HashSet<>();
        bookmaker.add(Role.BOOKMAKER);
        Set<Role> client = new HashSet<>();
        client.add(Role.CLIENT);

//        permissions.put("/", null);
//        permissions.put("/index", null);
//        permissions.put("/login", null);

        permissions.put("/logout", all);
        permissions.put("/password/edit", all);
        permissions.put("/password/save", all);

        permissions.put("/user/list", admin);
        permissions.put("/user/edit", admin);
        permissions.put("/user/save", admin);
        permissions.put("/user/delete", admin);

        permissions.put("/race/list", bookmaker);
        permissions.put("/request/list", users);
        permissions.put("/request/view", users);
        permissions.put("/request/edit", users);
        permissions.put("/request/save", users);
        permissions.put("/request/delete", users);
        permissions.put("/race/edit", bookmaker);
        permissions.put("/race/save", bookmaker);
        permissions.put("/race/delete", bookmaker);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {}

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest)req;
        HttpServletResponse httpResp = (HttpServletResponse)resp;
        String url = httpReq.getRequestURI();
        String context = httpReq.getContextPath();
        int postfixIndex = url.lastIndexOf(".html");
        if(postfixIndex != -1) {
            url = url.substring(context.length(), postfixIndex);
        } else {
            url = url.substring(context.length());
        }
        Set<Role> roles = permissions.get(url);
        if(roles != null) {
            HttpSession session = httpReq.getSession(false);
            if(session != null) {
                User user = (User)session.getAttribute("currentUser");
                if(user != null && roles.contains(user.getRole())) {
                    chain.doFilter(req, resp);
                    return;
                }
            }
        } else {
            chain.doFilter(req, resp);
            return;
        }
        httpResp.sendRedirect(context + "/login.html?message=login.message.access.denied");
    }

    @Override
    public void destroy() {}
}
