package com.contactapp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Table(name = "address")
@Getter
@Setter
@ToString
public class Address implements Serializable {

    @Id
    private Long id;

    @Size(max = 50)
    private String address1;

    @Size(max = 50)
    private String address2;

    @Size(max = 50)
    private String address3;

    @Size(max = 20)
    private String postalCode;
}
