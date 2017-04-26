package am.fundastisch.controller;

import am.fundastisch.dao.UserDao;
import am.fundastisch.dao.daoImpl.UserDaoImpl;
import am.fundastisch.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stellatahmazyan on 4/26/17.
 */
@RestController
public class UserController {

    @Autowired
    private UserDaoImpl userDao;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public ResponseEntity<User> addUser(@RequestBody User user){
//        userDao.getAll();
        return new ResponseEntity(user,HttpStatus.OK);
    }



}
