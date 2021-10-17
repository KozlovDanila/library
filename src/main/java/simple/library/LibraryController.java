package simple.library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
Класс, который позволяет открывать определенную ссылку в браузере
Например, http://localhost:8080/books
Метод books отработает тогда, когда в браузере будет открыта ссылка, указанная выше
Создаст два объекты-книги и отобразить их в html-коде index.html
Переходите в index.html
 */

@Controller
public class LibraryController {

	@GetMapping("/books")
	public String books(@RequestParam(defaultValue = "") String filter, @RequestParam(defaultValue = "") String value, Model model) {
		Book[] books = {
				new Book("Эрнест Миллер Хемингуэй", "Старик и море", 357),
				new Book("Фёдор Михайлович Достоевский", "Преступление и наказание", 402),
		};
		model.addAttribute("books", books);
		return "index";
	}

}
