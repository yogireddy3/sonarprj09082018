package prj_testing.controller;

import javax.inject.Inject;
import javax.inject.Named;

import org.resthub.web.controller.RepositoryBasedRestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import prj_testing.model.Sample;
import prj_testing.repository.SampleRepository;

@Controller
@RequestMapping(value = "/api/sample")
public class SampleController extends RepositoryBasedRestController<Sample, String, SampleRepository> {

    @Inject
    @Named("sampleRepository")
    @Override
    public void setRepository(SampleRepository repository) {
        this.repository = repository;
    }
}
