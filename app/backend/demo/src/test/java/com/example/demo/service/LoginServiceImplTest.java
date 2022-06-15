/**
 * 
 */
package com.example.demo.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.Optional;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.domain.Login;
import com.example.demo.repository.LoginRepository;
/**
 * @author Angela
 *
 */
@ExtendWith(MockitoExtension.class)

class LoginServiceImplTest {

	/**
	 * @throws java.lang.Exception
	 */
	private static Login l1;
	private static Login l2;

	@Mock
	private LoginRepository loginRepo;

	@InjectMocks
	private LoginServiceImpl loginService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		MockitoAnnotations.initMocks(this);
		l1 = new Login("ang", "123");
		l2 = new Login("ana", "6666");

	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
//		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Test method for {@link com.example.demo.service.LoginServiceImpl#getAll()}.
	 */
	@Test
	final void testGetAll_whenNoRecord() {
		Mockito.when(loginRepo.findAll()).thenReturn(Arrays.asList());
		Assertions.assertEquals(0, loginService.getAll().size());
		Mockito.verify(loginRepo, Mockito.times(1)).findAll();
	}

	@Test
	final void testGetAll_whenRecords() {
		Mockito.when(loginRepo.findAll()).thenReturn(Arrays.asList(l1, l2));
		Assertions.assertEquals(2, loginService.getAll().size());
		Assertions.assertEquals(l1, loginService.getAll().get(0));
		Assertions.assertEquals(l2, loginService.getAll().get(1));
		Mockito.verify(loginRepo, Mockito.times(3)).findAll();

	}

	/**
	 * Test method for
	 * {@link com.example.demo.service.LoginServiceImpl#getById(java.lang.Integer)}.
	 */
	@Test
	final void testGetById() {
        Mockito.when(loginRepo.findById(1)).thenReturn(Optional.of(l1));
		Assertions.assertEquals(l1, loginService.getById(1));
		Mockito.verify(loginRepo, Mockito.times(1)).findById(1);

	}

	/**
	 * Test method for
	 * {@link com.example.demo.service.LoginServiceImpl#add(com.example.demo.domain.Login)}.
	 */
	@Test
	final void testAdd() {
        Mockito.when(loginRepo.save(l1)).thenReturn(l1);
//        Assert.assertThat(loginService.add(l1), is(l1));

	}


	/**
	 * Test method for
	 * {@link com.example.demo.service.LoginServiceImpl#delete(java.lang.Integer)}.
	 */
	@Test
	final void testDelete() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link com.example.demo.service.LoginServiceImpl#update(com.example.demo.domain.Login)}.
	 */
	@Test
	final void testUpdate() {
		fail("Not yet implemented"); // TODO
	}

}
