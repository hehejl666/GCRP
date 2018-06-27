package cn.edu.hzvtc.gcrp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author : tao
 * @date : 2018-06-27 10:09
 */
@Table(name = "user")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "admin_id")
    private Long id;

    @Column(name = "admin_level")
    private Integer level;

    @Column(name = "admin_name",nullable = false,length = 200)
    private String name;

    @Column(name = "admin_password",nullable = false,length = 32)
    private String password;

    private Integer depid;
}
