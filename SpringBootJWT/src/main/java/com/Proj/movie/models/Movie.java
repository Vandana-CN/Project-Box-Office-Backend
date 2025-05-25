package com.Proj.movie.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movie"
//        uniqueConstraints = {
//                @UniqueConstraint(columnNames = "movieId")
//}

)
public class Movie {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", nullable = false, unique = true)
        private int id;
        @Column(name = "movieName", nullable = false)
        private String movieName;

        @Lob
        @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
        private String image;



        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }


        public String getMovieName() {
                return movieName;
        }

        public void setMovieName(String movieName) {
                this.movieName = movieName;
        }

        public String getImage() {
                return image;
        }

        public void setImage(String image) {
                this.image = image;
        }
}
