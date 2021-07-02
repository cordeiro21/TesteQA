@TestePreenchimento
Feature: AutomobileInsurance

  @VehicleData
  Scenario: Preenchimento de dados do veiculo
    Given Eu como usuario abro o navegador
    And Acesso o portal desejado
    When Preencho os dados do veiculo <make> <model> <cylindercapacity> <engineperformance> <dateofmanufacture> <numberofseats> <righthanddriveyes> <numberofseatsmotorcycle> <fuel> <payload> <totalweight> <listprice> <licenseplatenumber> <annualmileage> 
    Then Avanco para o proximo formulario
    
  Examples: 
      | make  | model 	| cylindercapacity |	engineperformance	|	dateofmanufacture	|	numberofseats	|	righthanddriveyes	|	numberofseatsmotorcycle	|	fuel	 |	payload	|	totalweight	|	listprice	|	licenseplatenumber	|	annualmileage	|
      | Ford  | Scooter |  150						 |				400					|			10/10/2010		|				4				|					Yes				|							2						| Petrol |		500		|			150			|		500			|			4343585838			|			50000			|


#	@InsurantData
  #Scenario: Preenchimento de dados do motorista
    #Given Como usuario pretendo continuar o preenchimento
    #And Quando acesso a proximo formulario
    #When Preencho os dados <firstname> <lastname> <birthdate>	<streetaddress>	<country>	<zipcode>	<occupation>
    #Then Avanco para o proximo formulario Product Data
    #
   #Examples: 
      #| firstname  | lastname 	| birthdate | streetaddress	|	country	|	zipcode	|	occupation	|
      #|		Rafael	 |	Cordeiro	|	19/07/1989|	 Rua Brauna		|	Brazil	|	26070654|		QA				|