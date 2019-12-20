package com.hit.lpm.situation.dao;

import com.hit.lpm.situation.model.KnowledgeEdges;
import com.hit.lpm.situation.model.KnowledgeNodes;
import com.hit.lpm.situation.model.KnowledgeRelation;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface LearningPathMapper {
    List<KnowledgeNodes> getPathNode(String courseId);
    List<KnowledgeEdges> getPathEdge(String courseId);
    int getStudentIdByUserId(int userId);
    List<KnowledgeRelation> getLearningSituation(@Param("studentId") int studentId, @Param("courseId") String courseId);
    String getCourseNameById(String courseId);
}
