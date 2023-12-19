package CódigoFuente_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.*;
import CódigoFuente_20677670_SaavedraOlmos.Menú_20677670_SaavedraOlmos.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Option_20677670_SaavedraOlmos op1 = new Option_20677670_SaavedraOlmos(1, "1) Hotel", 1, 1, List.of("hotel", "alojo", "habitación"));
        Option_20677670_SaavedraOlmos op2 = new Option_20677670_SaavedraOlmos(2, "2) Restaurant", 2, 1, List.of("comer", "servir", "llevar"));
	
        Flow_20677670_SaavedraOlmos f1 = new Flow_20677670_SaavedraOlmos(1, "Flow 1", List.of(op1, op1));
        f1.flowAddOption(op1);
        f1.flowAddOption(op2);
        
        Chatbot_20677670_SaavedraOlmos cb0 = new Chatbot_20677670_SaavedraOlmos(0, "Chatbot Inicial", "Muy buenos días\n¿Qué te gustaría hacer?", 1, List.of(f1));
        
        Option_20677670_SaavedraOlmos op3 = new Option_20677670_SaavedraOlmos(1, "1) 5 Estrellas", 1, 2, List.of("Excelente", "Muy buena calificación", "Gran Servicio"));
        Option_20677670_SaavedraOlmos op4 = new Option_20677670_SaavedraOlmos(2, "2) 4 Estrellas", 1, 1, List.of("Bueno", "Buen servicio"));
        Option_20677670_SaavedraOlmos op5= new Option_20677670_SaavedraOlmos(3, "3) 3 Estrellas", 1, 1, List.of("Mediana calidad", "Medio", "Regular"));
        Option_20677670_SaavedraOlmos op6 = new Option_20677670_SaavedraOlmos(4, "4) Volver", 0, 1, List.of("Salir", "Volver", "Retornar"));
        
        Option_20677670_SaavedraOlmos op7 = new Option_20677670_SaavedraOlmos(1, "1) Hotel Marriott", 1, 2, List.of("Marriott", "Hotel", "Hotel Marriott"));
        Option_20677670_SaavedraOlmos op8 = new Option_20677670_SaavedraOlmos(2, "2) Ritz-Carlton", 1, 2, List.of("Ritz", "Carlton", "Ritz-Carlton"));
        Option_20677670_SaavedraOlmos op9 = new Option_20677670_SaavedraOlmos(3, "3) Mandarín Oriental", 1, 3, List.of("Mandarín", "Oriental", "Mandarín Oriental"));
        Option_20677670_SaavedraOlmos op10 = new Option_20677670_SaavedraOlmos(4, "4) Cambiar destino", 1, 1, List.of("Regresar", "Volver", "Salir", "Retornar"));
        
        Option_20677670_SaavedraOlmos op11 = new Option_20677670_SaavedraOlmos(1, "1) Reserva Individual", 1, 3, List.of("Solo", "Individual"));
        Option_20677670_SaavedraOlmos op12 = new Option_20677670_SaavedraOlmos(2, "2) Reserva en pareja", 1, 3, List.of("Pareja", "Dos Personas", "Dos"));
        Option_20677670_SaavedraOlmos op13 = new Option_20677670_SaavedraOlmos(3, "3) Reserva en familia", 1, 3, List.of("Familia"));
        Option_20677670_SaavedraOlmos op14 = new Option_20677670_SaavedraOlmos(4, "4) Agregar más hoteles", 1, 2, List.of("Volver", "Más Reservas", "Más"));
        Option_20677670_SaavedraOlmos op15 = new Option_20677670_SaavedraOlmos(5, "5) En realidad quiero otro hotel", 1, 1, List.of("Cambiar hotel", "Otro", "Otro hotel"));
	
	Flow_20677670_SaavedraOlmos f2 = new Flow_20677670_SaavedraOlmos(1, "Flujo 1 Chatbot1\n¿Qué calidad hotelera desea buscar?", List.of(op3));
	f2.flowAddOption(op4);
	f2.flowAddOption(op5);
	f2.flowAddOption(op4);
	f2.flowAddOption(op6);
	
    	Flow_20677670_SaavedraOlmos f3 = new Flow_20677670_SaavedraOlmos(2, "Flujo 2 Chatbot1\n¿Qué atractivos te gustaría visitar?", List.of(op7, op8, op9, op10));
    	
    	Flow_20677670_SaavedraOlmos f4 = new Flow_20677670_SaavedraOlmos(3, "Flujo 3 Chatbot1\n¿Vas solo o acompañado?", List.of(op11, op12, op13));
    	f4.flowAddOption(op14);
    	f4.flowAddOption(op15);
    	
    	Chatbot_20677670_SaavedraOlmos cb1 = new Chatbot_20677670_SaavedraOlmos(1, "Agencia de hoteles", "Bienvenido\n¿Dónde quieres reservar tu estadía?", 1, List.of(f2, f3));
    	cb1.chatbotAddFlow(f4);
    	cb1.chatbotAddFlow(f3);
    	
    	Option_20677670_SaavedraOlmos o16 = new Option_20677670_SaavedraOlmos(1, "1) Entrada", 2, 1, List.of("Primer Plato", "Entrada", "Primero"));
        Option_20677670_SaavedraOlmos o17 = new Option_20677670_SaavedraOlmos(2, "2) Fondo", 2, 1, List.of("Segundo Plato", "Fondo", "Principal"));
        Option_20677670_SaavedraOlmos o18 = new Option_20677670_SaavedraOlmos(3, "3) Postre", 2, 1, List.of("Postre", "Dulce"));
        Option_20677670_SaavedraOlmos o19 = new Option_20677670_SaavedraOlmos(4, "4) Volver", 0, 1, List.of("Volver", "Salir", "Regresar"));
        
        Flow_20677670_SaavedraOlmos f5 = new Flow_20677670_SaavedraOlmos(1, "Flujo 1 Chatbot2\n¿Qué menú deseas escoger?", List.of(o16, o17, o18, o19));

    	Chatbot_20677670_SaavedraOlmos cb2 = new Chatbot_20677670_SaavedraOlmos(2, "Restaurante", "Bienvenido\n¿Qué te gustaría comer?", 1, List.of(f5));
    	cb2.chatbotAddFlow(f5);
    	
    	SystemChatbot_20677670_SaavedraOlmos s0 = new SystemChatbot_20677670_SaavedraOlmos("System1", 0, List.of(cb0));
    	s0.systemAddChatbot(cb0);
    	s0.systemAddChatbot(cb1);
    	s0.systemAddChatbot(cb2);
    	
    	User_20677670_SaavedraOlmos user0 = new AdminUser_20677670_SaavedraOlmos("user0");
    	User_20677670_SaavedraOlmos user1 = new User_20677670_SaavedraOlmos("user1", "Normal");
    	User_20677670_SaavedraOlmos user2 = new NormalUser_20677670_SaavedraOlmos("user2");
    	User_20677670_SaavedraOlmos user3 = new User_20677670_SaavedraOlmos("user3", "Admin");
    	User_20677670_SaavedraOlmos user4 = new NormalUser_20677670_SaavedraOlmos("user4");
    	
    	s0.systemAddUser(user0);
    	s0.systemAddUser(user1);
    	s0.systemAddUser(user1);
    	s0.systemAddUser(user2);
    	s0.systemAddUser(user3);
    	s0.systemAddUser(user4);
    	
    	List<SystemChatbot_20677670_SaavedraOlmos> systems = new ArrayList<>();
    	systems.add(s0);
    	
    	Menu_20677670_SaavedraOlmos menu = new Menu_20677670_SaavedraOlmos();
        menu.mainMenu(s0, systems);
    }
}
