package com.hcl.pp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.ResponseMessage;
import com.hcl.pp.service.PetService;

@RestController
public class PetsController {

	private static final Logger LOGGER = LogManager.getLogger(PetsController.class);

	@Autowired
	private PetService petService;

	@PostMapping(value = "/pets/addPet", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseMessage> addPet(@Valid @RequestBody Pet pet) {
		LOGGER.info(" Client Send The Requset" + " " + "URL" + "/pets/addPet" + "addPet Start");
		ResponseEntity<ResponseMessage> responseEntity = null;
		String statusOfAddPets = petService.savePet(pet);
		LOGGER.info("PetServiceInterface addPet Method Return Result Is" + statusOfAddPets);
		ResponseMessage responseMessage = new ResponseMessage();
		if (statusOfAddPets != null) {
			responseMessage.setMessage(statusOfAddPets);
			responseEntity = new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.CREATED);
		} else {
			responseMessage.setMessage("Try once again");
			LOGGER.info("Try once again");
			responseEntity = new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.BAD_REQUEST);

		}

		LOGGER.info("PetController addPet Method End");

		return responseEntity;
	}

	@GetMapping(value = "/pets", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Object>> petHome() {
		LOGGER.info(" Client Send The Requset" + " " + "URL" + "/pets" + "petHome Start");
		List<Pet> pets = null;
		List<Object> errorMessageObject = null;
		ResponseEntity<List<Object>> responseEntity = null;
		pets = petService.getAllPets();
		LOGGER.info("PetServiceInterface petHome Method Return Result");
		if (pets != null && pets.size() > 0) {
			List<Object> petObjects = new ArrayList<Object>();
			petObjects.addAll(pets);
			responseEntity = new ResponseEntity<List<Object>>(petObjects, HttpStatus.CREATED);
			return responseEntity;
		} else {
			errorMessageObject = new ArrayList<Object>();
			errorMessageObject.add("Pets are not available in the database table");
			LOGGER.info("Pets are not available in the database table");
			responseEntity = new ResponseEntity<List<Object>>(errorMessageObject, HttpStatus.BAD_REQUEST);

		}

		LOGGER.info("PetController petHome Method End");

		return responseEntity;

	}

	@GetMapping(value = "/pets/petDetail/{petId}")
	public ResponseEntity<Object> petDetail(@PathVariable long petId) {
		LOGGER.info(" Client Send The Requset" + " " + "URL" + "/pets/petDetail/{petId}" + "petDetail Start");
		Pet pet = null;
		ResponseEntity<Object> responseEntity = null;
		pet = petService.getPetById(petId);
		LOGGER.info("PetServiceInterface petDetail Method Return Result");
		if (pet != null) {
			responseEntity = new ResponseEntity<Object>(pet, HttpStatus.FOUND);

		} else {

			responseEntity = new ResponseEntity<Object>("Your Passing PetId Details are Not Present In DB Plz Check It",
					HttpStatus.BAD_REQUEST);
			LOGGER.info("Your Passing PetId Details are Not Present In DB Plz Check It");

		}

		LOGGER.info("PetController petDetail Method End");
		return responseEntity;

	}

	@PutMapping(value = "/pets/updatePet", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updatePetDetails(@Valid @RequestBody Pet pet) {
		LOGGER.info(" Client Send The Requset" + " " + "URL" + "/pets/updatePet" + "updatePetDetails Start");
		Pet petOne = null;
		ResponseEntity<Object> responseEntity = null;
		petOne = petService.updatePet(pet);
		LOGGER.info("PetServiceInterface updatePetDetails Method Return Result");
		if (petOne != null) {
			responseEntity = new ResponseEntity<Object>(pet, HttpStatus.ACCEPTED);

		} else {
			responseEntity = new ResponseEntity<Object>("Updation Failed, Check the Pet Details",
					HttpStatus.BAD_REQUEST);
			LOGGER.info("Updation Failed, Check the Pet Details");

		}
		LOGGER.info("PetController updatePet Method End");
		return responseEntity;

	}

	@DeleteMapping(value = "/pets/deletePet/{petId}")
	public ResponseEntity<ResponseMessage> deletePetById(@PathVariable long petId) {
		LOGGER.info(" Client Send The Requset" + " " + "URL" + "/pets/deletePet/{petId}" + "deletePetById Start");
		ResponseEntity<ResponseMessage> responseEntity = null;
		ResponseMessage responseMessage = new ResponseMessage();
		String statausOfDeletePet = petService.deletePetById(petId);
		LOGGER.info("PetServiceInterface deletePetById Method Return Result");

		if (statausOfDeletePet != null) {
			responseMessage.setMessage(statausOfDeletePet);
			responseEntity = new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.GONE);
		} else {
			responseMessage.setMessage("Plz Try Once Again");
			LOGGER.info("Plz Try Once Again");
			responseEntity = new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.BAD_REQUEST);

		}

		LOGGER.info("PetController deletePetById Method End");
		return responseEntity;

	}

}
