package com.nacsoft.etut.business.StudentBusiness;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.nacsoft.etut.Entities.Program;
import com.nacsoft.etut.dataAccess.TeacherDal.ITeacherDal;

@Service
public class TeacherManager implements ITeacherService {
	
	private ITeacherDal teacherDal;

	@Autowired
	public TeacherManager(ITeacherDal teacherDal) {
		this.teacherDal = teacherDal;
	}

	@Override
	@Transactional
	public List<Program> onaylanmisDersler() {
		
		return this.teacherDal.onaylanmisDersler();
	}

	@Override
	@Transactional
	public List<Program> bekleyenDersler() {
		return this.teacherDal.bekleyenDersler();
	}

	@Override
	@Transactional
	public void add(Program program) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(Program program) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delate(Program program) {
		// TODO Auto-generated method stub
		
	}

}
