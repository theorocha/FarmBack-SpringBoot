package com.MFTest.Farm;

import com.MFTest.Farm.entities.*;
import com.MFTest.Farm.enums.SexoEnum;
import com.MFTest.Farm.repositories.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@SpringBootApplication
public class FarmApplication {

	@Autowired
	private GadoRepository gadoRepository;

	@Autowired
	private PastoRepository pastoRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	@Autowired
	private FarmRepository farmRepository;

	@Autowired
	private FuncionariosRepository funcionariosRepository;

	public static void main(String[] args) {
		SpringApplication.run(FarmApplication.class, args);
	}

//	@PostConstruct
//	public void init() {
//		Farm f1 = new Farm("São Judas Tadeu",310700);
//		farmRepository.save(f1);
//
//		LocalDate d_func1 = LocalDate.of(1960,10,10);
//		LocalDate d_func2 = LocalDate.of(1990,12,6);
//		Funcionario func1 = new Funcionario("Divino", SexoEnum.M, 567,d_func1,f1);
//		Funcionario func2 = new Funcionario("Guilherme", SexoEnum.M, 5679,d_func2,f1);
//		funcionariosRepository.save(func1);
//		funcionariosRepository.save(func2);
//
//		Owner o1 = new Owner("Paulo Cézar");
//		Owner o2 = new Owner("Theo Rocha");
//		ownerRepository.save(o1);
//		ownerRepository.save(o2);
//
//		Pasto p1 = new Pasto("Matinha",f1);
//		Pasto p2 = new Pasto("Eucalipto de Cima",f1);
//		Pasto p3 = new Pasto("Eucalipto de Baixo",f1);
//		pastoRepository.save(p1);
//		pastoRepository.save(p2);
//		pastoRepository.save(p3);
//
//		Gado g1 = new Gado(300,"Nelore", SexoEnum.F,p1);
//		Gado g2 = new Gado(350,"Nelore", SexoEnum.F,p1);
//		Gado g3 = new Gado(350,"Nelore", SexoEnum.F,p1);
//		Gado g4 = new Gado(370,"Angus", SexoEnum.F,p2);
//		Gado g5 = new Gado(380,"Angus", SexoEnum.F,p2);
//		Gado g6 = new Gado(400,"Angus", SexoEnum.F,p2);
//		Gado g7 = new Gado(410,"Gir", SexoEnum.M,p3);
//		Gado g8 = new Gado(420,"Gir", SexoEnum.M,p3);
//		Gado g9 = new Gado(430,"Gir", SexoEnum.M,p3);
//		gadoRepository.save(g1);
//		gadoRepository.save(g2);
//		gadoRepository.save(g3);
//		gadoRepository.save(g4);
//		gadoRepository.save(g5);
//		gadoRepository.save(g6);
//		gadoRepository.save(g7);
//		gadoRepository.save(g8);
//		gadoRepository.save(g9);
//	}
}






