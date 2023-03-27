package com.symbol.birdnote.domain.birdwatchimage;

import com.symbol.birdnote.domain.birdwatch.BirdWatch;
import com.symbol.birdnote.domain.image.Image;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "idBirdWatch")
@Entity(name = "birdwatchimage")
@Table(name = "BIRD_WATCH_IMAGE")
public class BirdWatchImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBirdWatchImage;
    private float latitude;
    private float longitude;
    private LocalDateTime dataCriacao;

    @Embedded
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idBirdWatch")
    private BirdWatch birdWatch;

    @Embedded
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idImage")
    private Image image;
}
