
package com.collaborativeportal.dao;

import java.util.List;

import com.collaborativeportal.model.UserBlog; 


public interface UserdetailDao {
 public int insertRow(UserBlog user);

 public List getList();

 public UserBlog getRowById(int usid);

 public int updateRow(UserBlog user);

 public int deleteRow(int usid);

}