package com.ust.capstone.user_details_service.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_info_details_id")
    private Long userDetailsId;

    @Column(name="user_info_id")
    private Long userInfoId;

    @Column(name="user_info_fname")
    private String userFirstName;

    @Column(name="user_info_lname")
    private String userLastName;

    @Column(name="user_info_email")
    private String userEmail;

    @Column(name="user_info_company", nullable = true)
    private String userCompany;

}
