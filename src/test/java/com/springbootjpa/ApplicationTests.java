package com.springbootjpa;

import com.springbootjpa.domain.Movie;
import com.springbootjpa.service.MovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

  @Autowired
  private MovieService movieService;

  @Test
  public void save() {
    Movie movie = new Movie();
    // 当设置id 自动变成更新数据的操作
//    movie.setId(3);
    movie.setName("海上钢琴师");
    movie.setPrice(80d);
    movie.setActionTime(new Date());
    movieService.save(movie);
  }

  @Test
  public void findAll(){
    List<Movie> movies = movieService.findAll();
    for(Movie movie : movies){
      System.out.println(movie.getName()+" "+movie.getPrice());
    }
  }

  @Test
  public void get(){
    Optional<Movie> movies = movieService.findById(3);
    System.out.println(movies.get().getName());
  }

  @Test
  public void remove(){
    movieService.deleteById(3);
  }

}
