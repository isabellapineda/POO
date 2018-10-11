clase fecha
	definir dia como entero
	definir mes como entero
	definir año como entero



	medoto fech(dia,mes,año)
	dia=dia
	mes=mes
	año=año
fin metodo


fin clase

	metodo ingresar_fecha

	mostrar "ingresar el dia"
	leer dia
	mostrar "ingresar el mes"
	leer mes
	mostrar "ingresar el año"
	leer año


fin metodo




clase  estudiante
	definir nombre como caracter
	definir examen1, examen2, examen3 como real
	definir  evaluacion_c como real
	definir trabajo_p como real
	private nota_total_100 como real
	private nota_20 como real
	definir nota_4 como real





	metodo leer_datos()

		para i=1 hasta 8 hacer 	

				mostrar "ingrese el nombre del estudiante"
				leer nombre
				mostrar"ingrese el examen 1,2 y 3"
				leer examen1, examen2, examen3
				mostrar "ingrese la nota de la evaluacion  del estudiante continua"
				leer evaluacion_c
				mostrar"ingrese la nota del trabajo practico  "
				leer trabajo_p
		finpara 
	fin metodo



metodo getnota100 () como real
 retornar  examen1+examen2+examen3+evaluacion_c+trabajo_p
fin metodo

public metodo calcular(nota_total_100)
nota_20= nota_total_100/5
fin metodo


si nota_20>80 entonces 
    mostrar "aprobado" 
sino si nota_20<80 entonces
    mostrar "sigue intentando"
fin si 
 

metodo calcular()
	
	nota_20= nota_total_100/5
	nota_4= nota_total_100/25
fin metodo


metodo salida()
mostrar "el estudiante " nombre " tiene un calificacion de: "
mostrar " en la escala de 100 pts: " nota_total_100
mostrar "en la escala de 20 pts: " nota_20
mostrar "en la escala de 4 pts: " nota_4
mostrar "gracias por utilizar este programa" 
fin metodo


	

fin clase



algoritmo
	definir est1,est2,est3 como estudiante 


	est1= nuevo estudiante()
	
	est1.leer_datos()
	est1.calcular()
	est1.salida()
	est1.fech("12","9","2018")
	est1.examen1=17
	est1.examen2=16
	est1.examen3=20
	evaluacion_c=3
	trabajo=2

	nota_total_100=(est1.nota100)
	mostrar "La nota en la escala de 100 " nota_total_100
	est1.calcular(nota_total_100)

	fecha.ingresar_fecha()
	fecha.mostrar_fecha()
	si getnota100>=90 entonces
	    mostrar "Excelente"
	fin si
	si est1.getnota100()<90 y est1.getnota100()>=50 entonces
		mostrar "Aceptable"
	fin si 
	si est1.getnota100()<50 entonces
		mostrar "Reprobado"
	fin si


	para n=1 hasta 8 hacer
		est1.salida() 
	finpara 



Fin algoritmo


 
