//package com.washermanagement.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import com.washermanagement.model.Washer;
//import com.washermanagement.service.WasherService;
//
//class WasherControllerTest {
//	
//	@Mock
//    private WasherService washerService;
//	
//	@InjectMocks
//    private WasherController washerController;
//	
//	private Washer washer;
//	
//	@BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        washer = new Washer(1L,"Santhosh", 8639369136L, "rb8989@gmail.com", "Atmakur", 232523252325L, 2500, 28);
//    }
//	
//	@Test
//    void createWasherTest() {
//        when(washerService.add(washer)).thenReturn(washer);
//
//        Washer createdWasher = washerController.create(washer);
//
//        assertNotNull(createdWasher);
//        assertEquals(1L, createdWasher.getWasher_id());
//        assertEquals("Santhosh", createdWasher.getName());
//        assertEquals(8639369136L, createdWasher.getPhno());
//        assertEquals("rb8989@gmail.com", createdWasher.getEmail());
//        assertEquals( "Atmakur", createdWasher.getAddress());
//        assertEquals(232523252325L, createdWasher.getWasher_NIC());
//        assertEquals(2500, createdWasher.getSalary());
//        assertEquals(28, createdWasher.getAge());
//        verify(washerService, times(1)).add(washer);
//    }
//	
//	@Test
//    void getAllTest() {
//        List<Washer> washerList = Arrays.asList(
//                new Washer(1L,"Santhosh", 8639369136L, "rb8989@gmail.com", "Atmakur", 232523252325L, 2500, 28),
//                new Washer(2L,"Myke", 8639369135L, "rb8988@gmail.com", "Vijayawada", 232523252326L, 3500, 29)
//        );
//        when(washerService.get()).thenReturn(washerList);
//
//        List<Washer> result = washerController.getAll();
//
//        assertNotNull(result);
//        assertEquals(2, result.size());
//        verify(washerService, times(1)).get();
//    }

//}
