package com.peactor.springbucks.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName BaseEntity
 * @Description 作为基类继承给子类,主要提供注解和实现的序列化接口以及公共的字段,如创建时间和更新时间
 * @Author Ifan
 * @Date 20-1-20
 **/
@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(updatable = false)
    @CreationTimestamp
    private Date createTime;

    @UpdateTimestamp
    private Date updateTime;
}
