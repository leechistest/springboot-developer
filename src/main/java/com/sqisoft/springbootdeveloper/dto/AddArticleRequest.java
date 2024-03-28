package com.sqisoft.springbootdeveloper.dto;

import com.sqisoft.springbootdeveloper.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
  private String title;
  private String content;

  public Article toEntity() {
    return Article.builder().title(title).content(content).build();
  }
}
