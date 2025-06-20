package com.example.demoC1221325_62;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collection;


public class orderService {
    private final JdbcTemplate jdbc;
    private String sqlQuery;


    public orderService(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public Collection<order> getAllStudent(){
         sqlQuery = "select * from students";
        return jdbc.query(sqlQuery,new BeanPropertyRowMapper<>(order.class));

    }

    public void createStudent(order std){
        sqlQuery = "insert into students values(? , ? , ? , ? , ?)";
        jdbc.update(sqlQuery,std.getOrderId(),std.getOrderName(),std.getPrice());
    }
    public void updateStudent(order std, int orderId){
        sqlQuery="update students set orderID=?, orderNaame=?,price=?";
        jdbc.update(sqlQuery,std.getOrderName(),std.getPrice(),orderId);
}


}
