package com.utility.commons.utilitycommons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "worker_id")
    private Long workerId;
    private String workerName;
    private int age;
    private Long phoneNumber;

    @ManyToMany
    @JoinColumn(name = "worker_id",referencedColumnName = "category_id")
    private Set<Category> categories;
}
