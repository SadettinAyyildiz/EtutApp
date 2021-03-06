package com.nacsoft.etut.restApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nacsoft.etut.Entities.Program;
import com.nacsoft.etut.business.StudentBusiness.ITeacherService;

@RestController
@RequestMapping("/ogretmen")
public class TeacherController {
	
	@Autowired     // sadece bir sınıf kullanıyor diye hu şekilde, yoksa ayrı sınıf ile yapılması lazım
	private ITeacherService teacherService;

	public TeacherController(ITeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	@GetMapping("/randevu-olustur")
	public List<Program> onaylanmisDersler(){
		return teacherService.onaylanmisDersler();
	}

}
