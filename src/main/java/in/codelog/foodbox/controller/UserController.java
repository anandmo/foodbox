package in.codelog.foodbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.codelog.foodbox.model.User;
import in.codelog.foodbox.repository.UserRepository;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/user")
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable(value = "id") int id) {
		userRepository.deleteById(id);
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<Object> updateUser(@RequestBody User user, @PathVariable(value = "id") int id) {

		User tempUser = userRepository.getById(id);

		if (tempUser == null)
			return ResponseEntity.notFound().build();

		user.setU_id(id);
		userRepository.save(user);

		return ResponseEntity.noContent().build();
	}

	@PostMapping("/verifylogin")
	public User verifyLogin(@RequestBody User user) {
		
		User dummyUser = new User(0,"NOT_VALID","NOT_VALID","NOT_VALID","NOT_VALID");
		
		List<User> listedUser = userRepository.findByEmail(user.getU_email());
		//System.out.println("LOG DETECT "+user.getU_email());
		//System.out.println("LOG DETECT "+listedUser);
		
		if (listedUser.isEmpty())
			return dummyUser;
		
		if (listedUser.get(0).getU_password().equals(user.getU_password())) {
			return user;
		} else {
			return dummyUser;
		}
		
	}

}
