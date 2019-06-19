/**
 * 
 */
package com.foodallert.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.foodallert.dto.Article;

/**
 * @author SPS15
 *
 */
public class ArticlesGenerator {
	private static final Logger logger = Logger.getLogger(ArticlesGenerator.class);
	
	public static List<Article> generateArticlesList() {
		logger.info("Generating article dummy list");
		List<Article> articles = new ArrayList<Article>();
		
		Article article = new Article("Manejo de alergias alimentarias: Lo que necesita saber",
							"Las alergias alimentarias pueden ser graves, pero usted puede manejarlas con la ayuda de su alergista y otros especialistas.",
							"https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/articles/article1.jpg",
							"https://www.foodallergy.org/life-with-food-allergies/living-well-everyday/avoiding-cross-contact");
		
		articles.add(article);
		
		article = new Article("Consejos para evitar su alérgeno",
				"Preste especial atención a las fuentes inesperadas de alérgenos, como en el caso de los ingredientes que se enumeran a continuación.",
				"https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/articles/article2.jpg",
				"https://www.foodallergy.org/life-with-food-allergies/food-allergy-101/what-is-a-food-allergy");

		articles.add(article);
		
		article = new Article("Cenar fuera de casa con alergias alimentaria",
				"Cuando usted está de cena fuera de casa y tiene alergias alimentarias, planificar con anticipación es importante. Siga estos consejos sobre qué hacer antes de salir y cuando se encuentre en el restaurante para tener una mejor experiencia culinaria",
				"https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/articles/article3.png",
				"https://www.foodallergy.org/life-with-food-allergies/managing-lifes-milestones/dining-out/at-the-restaurant");

		articles.add(article);
		
		article = new Article("Evite el contacto cruzado",
				"El contacto cruzado ocurre cuando un alimento entra en contacto con otro alimento y sus proteínas se mezclan. Como resultado, cada alimento contiene pequeñas cantidades del otro alimento. ",
				"https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/articles/article4.png",
				"https://www.foodallergy.org/life-with-food-allergies/living-well-everyday/avoiding-cross-contact");

		articles.add(article);
		
		article = new Article("Alergias alimentarias: mantenga sus comensales fuera de peligro",
				"Todo el equipo de la alimentación que se utiliza en el manejo y procesamiento de alimentos alergia seguro debe limpiarse y desinfectarse antes de usarse correctamente.",
				"https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/articles/article5.jpg",
				"https://www.foodallergy.org/life-with-food-allergies/living-well-everyday/avoiding-cross-contact");

		articles.add(article);
		
		article = new Article("Comprender las etiquetas de los alimentos",
				"Leer cada etiqueta de los alimentos en cada ocasión es una de las mejores maneras de mantener seguros tanto a ustedcomo a sus seres queridos.",
				"https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/articles/article6.jpg",
				"https://www.foodallergy.org/life-with-food-allergies/food-allergy-101/what-is-a-food-allergy");

		articles.add(article);
		
		
		return articles;
	}
			
}
