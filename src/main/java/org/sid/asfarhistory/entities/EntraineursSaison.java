package org.sid.asfarhistory.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor
public class EntraineursSaison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @ColumnDefault("0")
    @Column(name = "won", insertable = true, updatable = true, nullable = false)
    private int won;
    @ColumnDefault("0")
    @Column(name = "draw", insertable = true, updatable = true, nullable = false)
    private int draw;
    @ColumnDefault("0")
    @Column(name = "lost", insertable = true, updatable = true, nullable = false)
    private int lost;
    @ColumnDefault("0")
    @Column(name = "botolawon", insertable = true, updatable = true, nullable = false)
    private int botolawon;
    @ColumnDefault("0")
    @Column(name = "botoladraw", insertable = true, updatable = true, nullable = false)
    private int botoladraw;
    @ColumnDefault("0")
    @Column(name = "botolalost", insertable = true, updatable = true, nullable = false)
    private int botolalost;
    @ColumnDefault("0")
    @Column(name = "coupeDuTronewon", insertable = true, updatable = true, nullable = false)
    private int coupeDuTronewon;
    @ColumnDefault("0")
    @Column(name = "coupeDuTronedraw", insertable = true, updatable = true, nullable = false)
    private int coupeDuTronedraw;
    @ColumnDefault("0")
    @Column(name = "coupeDuTronelost", insertable = true, updatable = true, nullable = false)
    private int coupeDuTronelost;
    @ColumnDefault("0")
    @Column(name = "clwon", insertable = true, updatable = true, nullable = false)
    private int clwon;
    @ColumnDefault("0")
    @Column(name = "cldraw", insertable = true, updatable = true, nullable = false)
    private int cldraw;
    @ColumnDefault("0")
    @Column(name = "cllost", insertable = true, updatable = true, nullable = false)
    private int cllost;
    @ColumnDefault("0")
    @Column(name = "coupeDeCAFwon", insertable = true, updatable = true, nullable = false)
    private int coupeDeCAFwon;
    @ColumnDefault("0")
    @Column(name = "coupeDeCAFdraw", insertable = true, updatable = true, nullable = false)
    private int coupeDeCAFdraw;
    @ColumnDefault("0")
    @Column(name = "coupeDeCAFlost", insertable = true, updatable = true, nullable = false)
    private int coupeDeCAFlost;
    @ColumnDefault("0")
    @Column(name = "superCoupewon", insertable = true, updatable = true, nullable = false)
    private int superCoupewon;
    @ColumnDefault("0")
    @Column(name = "superCoupedraw", insertable = true, updatable = true, nullable = false)
    private int superCoupedraw;
    @ColumnDefault("0")
    @Column(name = "superCoupelost", insertable = true, updatable = true, nullable = false)
    private int superCoupelost;
    @ColumnDefault("0")
    @Column(name = "anotherCompwon", insertable = true, updatable = true, nullable = false)
    private int anotherCompwon;
    @ColumnDefault("0")
    @Column(name = "anotherCompdraw", insertable = true, updatable = true, nullable = false)
    private int anotherCompdraw;
    @ColumnDefault("0")
    @Column(name = "anotherComplost", insertable = true, updatable = true, nullable = false)
    private int anotherComplost;
    private String saison;
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Entraineurs entraineurs;

    public EntraineursSaison(String nom, String prenom, int won, int draw, int lost, String image, int botolawon, int botoladraw, int botolalost, int coupeDuTronewon, int coupeDuTronedraw, int coupeDuTronelost, int clwon, int cldraw, int cllost, int coupeDeCAFwon, int coupeDeCAFdraw, int coupeDeCAFlost, int superCoupewon, int superCoupedraw, int superCoupelost, int anotherCompwon, int anotherCompdraw, int anotherComplost, String saison, Entraineurs entraineurs) {
        this.nom = nom;
        this.prenom = prenom;
        this.won = won;
        this.draw = draw;
        this.lost = lost;
        this.botolawon = botolawon;
        this.botoladraw = botoladraw;
        this.botolalost = botolalost;
        this.coupeDuTronewon = coupeDuTronewon;
        this.coupeDuTronedraw = coupeDuTronedraw;
        this.coupeDuTronelost = coupeDuTronelost;
        this.clwon = clwon;
        this.cldraw = cldraw;
        this.cllost = cllost;
        this.coupeDeCAFwon = coupeDeCAFwon;
        this.coupeDeCAFdraw = coupeDeCAFdraw;
        this.coupeDeCAFlost = coupeDeCAFlost;
        this.superCoupewon = superCoupewon;
        this.superCoupedraw = superCoupedraw;
        this.superCoupelost = superCoupelost;
        this.anotherCompwon = anotherCompwon;
        this.anotherCompdraw = anotherCompdraw;
        this.anotherComplost = anotherComplost;
        this.saison = saison;
        this.entraineurs = entraineurs;
        this.saison=saison;
    }

}
