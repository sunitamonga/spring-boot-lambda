package com.hackingchicago.controller;

import com.amazonaws.services.lambda.runtime.Context;
import com.hackingchicago.InvestLambdaApplication;
import com.hackingchicago.model.Donor;
import com.hackingchicago.repository.DonorRepository;
import com.hackingchicago.repository.SomeService;
//import com.amazonaws.services.lambda.runtime.RequestHandler;
public class LambdaFunctionHandler   {

	//private static final Logger LOGGER = LoggerFactory.getLogger(EasyInvoiceController.class);

	//@Autowired
	private DonorRepository repo;
	
	public String getDonors(Donor donor, Context context) {
		SomeService service = InvestLambdaApplication.getBean(SomeService.class);
		return service.saySomething();
	}
//	public List<Donor> getDonors(Donor donor, Context context) {
//		repo = InvestLambdaApplication.getBean(DonorRepository.class);
//		return (List<Donor>) repo.findAll();
//	}
	
	public void saveDonor(Donor donor, Context context) {
		repo.save(donor);
	}
	
	/*
	public void saveDonorsFromCSV() {
		
	}
	
	public <T> List<T> loadObjectList(Class<T> type, String fileName) {
	    try {
	        CsvSchema bootstrapSchema = CsvSchema.emptySchema().withHeader();
	        CsvMapper mapper = new CsvMapper();
	        File file = new ClassPathResource(fileName).getFile();
	        MappingIterator<T> readValues = 
	          mapper.reader(type).with(bootstrapSchema).readValues(file);
	        return readValues.readAll();
	    } catch (Exception e) {
	    	e.printStackTrace();
	        System.err.println("Error occurred while loading object list from file " + fileName);
	        return Collections.emptyList();
	    }
	}
	
	public List<Donor> getDonors() {
		return loadObjectList(Donor.class, "donors.csv");
	} */
}
