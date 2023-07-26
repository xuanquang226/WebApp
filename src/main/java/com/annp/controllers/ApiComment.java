/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annp.controllers;

import com.annp.pojo.Comment;
import com.annp.pojo.Product;
import com.annp.pojo.Users;
import com.annp.service.CommentService;
import com.annp.service.ProductService;
import com.annp.service.UserService;
import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/api")
public class ApiComment {
    @Autowired
    private CommentService commentService;
    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;
    
    @GetMapping("/products/{productId}/comments")
    public ResponseEntity<List<Comment>> getComments(@PathVariable(value = "productId") int id) {
        List<Comment> comments = this.commentService.getComments();
        
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
    
    @PostMapping(path = "/products/{productId}/comments", produces = {
        MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity<Comment> addComment(@RequestBody Map<String, String> params, 
            @PathVariable(value = "productId") int id, Principal pricipal) {
        Product p = this.productService.getProductById(id);
        Users u = this.userService.getUserByUsername(pricipal.getName());
        
        Comment c = new Comment();
        c.setContent(params.get("content"));
        c.setProductid(p);
        c.setUserid(u);
        c.setCreatedDate(new Date());
        c = this.commentService.addComment(c);
        if (c != null)
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
