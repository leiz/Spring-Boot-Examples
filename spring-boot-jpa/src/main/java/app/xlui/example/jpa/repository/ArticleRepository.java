package app.xlui.example.jpa.repository;

import app.xlui.example.jpa.entity.Article;
import app.xlui.example.jpa.entity.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article findArticleById(Long id);

    List<Article> findArticleBySort(Sort sort);

//	基于注解的查询
//	@Query("select a from t_article a where a.id=?1")
//	Article findArticleUsingQuery(Long id);
//
//  基于注解和参数的查询
//	@Query("select a from t_article a where a.id=:id")
//	Article findArticleUsingQueryParam(@Param("id") Long id);
}
