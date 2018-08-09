package prj_testing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import prj_testing.model.Sample;

public interface SampleRepository extends MongoRepository<Sample, String> {

}
