package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="kisi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of={"id"})
@ToString
public class Kisi {
    @Id
    @SequenceGenerator(name="seq_kisi",allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi",strategy = GenerationType.SEQUENCE) //id fieldı üretilirken  GeneratedValue ile yaratıyoruz
    private Long id;

    @Column(length = 100,name = "adi")
    private String adi;

    @Column(length = 100,name = "soyadi")
    private String soyadi;

    //Join işlemi

    @OneToMany //bir kişiyi birçok adrese atayabiliriz
    @JoinColumn(name = "kisi_adres_id")
    private List<Adres> adresleri;

}
