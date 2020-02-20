package com.omercavuslu.entity;

import lombok.*;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "kisi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"}) // 2 kayıdın id leri aynıysa o kayıtlar aynıdır
@ToString
public class Kisi {

    @Id
    @SequenceGenerator(name = "seq_kisi",allocationSize = 1)//1 rer 1 rer artması için
    @GeneratedValue(generator = "seq_kisi", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, name = "adi")
    private String adi;

    @Column(length = 100, name = "soyadi")
    private String soyadi;

    //adres ile join yaptık
    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    private List<Adres> adresleri;
}
