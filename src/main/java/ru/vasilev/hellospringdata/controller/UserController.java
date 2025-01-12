package ru.vasilev.hellospringdata.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import ru.vasilev.hellospringdata.model.User;
import ru.vasilev.hellospringdata.repository.UserRepository;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
	private Logger log = LoggerFactory.getLogger(UserController.class);
	private UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping()
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	@PostMapping()
	public User createUser(@RequestBody User user) {
		log.info(user.toString());
		return userRepository.save(user);
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		return userRepository.findById(id).orElseThrow();
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User user) {
		log.info(user.toString());
		user.setId(id);
		log.info(user.toString());
		return userRepository.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
	}
}