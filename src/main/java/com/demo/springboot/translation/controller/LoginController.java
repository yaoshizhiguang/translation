package com.demo.springboot.translation.controller;

import com.demo.springboot.translation.common.domain.User;
import com.demo.springboot.translation.mapper.UserMapper;

import com.demo.springboot.translation.service.UserService;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.logging.Logger;

/*该类与前端登录界面对接
  用于处理用户登录和注册操作
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/index")
    public String goLoginPage(@RequestParam("tag")String tag, Model model){
        model.addAttribute("tag",tag);
        return "login";
    }

    /*@GetMapping("/register")
    public String goLoginPage2(){
        return "login";
    }*/
    @RequestMapping("/login")
    public String loginUser(HttpServletRequest request, User user, Map<String, Object> map){
        if(user.getUid()==""){
            map.put("msg", "请输入用户名");
            return "index";
        }
        if(userMapper.selectByPrimaryKey(user.getUid())==null){
            map.put("msg", "用户不存在");
            return "index";
        }
        User loginUser = userService.checkUserAndPassword(user);
        //uName = loginUser.getUserName();
        if(loginUser != null ){
            request.getSession().setAttribute("user",loginUser);
                return "search_result";
        }else{
            map.put("msg", "用户名或密码错误");
        }
        return "index";
    }
    @RequestMapping("/register")
    public String goRegistPage() {
        return "register";
    }
    @PostMapping("/register")
    public String RegistUser(Model model, @RequestParam("userID")String uId, @RequestParam("userName")String name,
                             @RequestParam("password")String password, Map<String, Object> map) {
        User user = null;
        if (uId.isEmpty()||name.isEmpty()||password.isEmpty()){
            map.put("msg", "输入信息不能为空");
            return "register";
        }else {
            user = new User(uId,password,name);
        }
        if(userService.findUser(user)==null) {
            if(userService.saveUser(user) == 1){
                return "login";
            }else {
                String strClassName = LoginController.class.getName();
                Logger logger = Logger.getLogger(strClassName);
                logger.warning("save Failure");
            }

        }else{
            map.put("msg", "用户名已存在，请重新输入");
            return "register";
        }
        return "login";
    }
    /*@GetMapping("/showUserInfo")
    public String goUserInfo(){
        return "showUserInfo";
    }*/

    @GetMapping("/showUserInfo")
    public  String showUserInfo(Model model,HttpServletRequest request){
        // User user = userMapper.selectByPrimaryKey(uName);
        User user = (User)request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "showUserInfo";
    }
    @GetMapping("/User_information")
    public String goUserInfo(){
        return  "User_information";
    }
    @PostMapping("/User_information")
    public  String changeUserInfo(@RequestParam("realName")String realName,@RequestParam("email")String email,
                                  @RequestParam("ID")String id,@RequestParam("phone")String phone,
                                  HttpServletRequest request){
        User u = (User)request.getSession().getAttribute("user");
        User user = userMapper.selectByPrimaryKey(u.getUid());
        User user1 = new User(user.getUid(),user.getPass(),realName);
        userService.updateUser(user1);
        request.getSession().setAttribute("user", user1);
        return "showUserInfo";
    }



}
