package com.saretto.cruddemo.dao;

import com.saretto.cruddemo.entity.Instructor;
import com.saretto.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);
}
