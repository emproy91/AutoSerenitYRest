# AutoSerenitYRest
This is the development for a SIIGO challenge, where we will test client creation on the platform using the Screenplay pattern, with Serenity BDD, Cucumber, Gradle, Gherkin, Java, and JMeter; we will also perform REST API tests on the ReqRes page using Serenity-Rest and Postman, also under the Screenplay pattern. Maybe a bonus in POM. ;)

## Challenge Parts:

## 1. Front End: This part can be found in the [bScreenP](https://github.com/emproy91/AutoSerenitYRest/tree/main/bScreenP) folder, where you'll find the readme for a template I created a few years ago.

a) Equivalence Partitioning (Example):

Valid classes: Name between 2-100 characters, Phone 10 digits.

Invalid classes: Empty name, Phone with letters.

b) Limit Values:

Name: 1 character (invalid), 2 characters (valid), 100 characters (valid), 101 characters (invalid).

c) Decision Table (Example):

|Required Field |Valid Name |Valid Phone |Expected Result|
|---|---|---|---|
|Yes |No |Yes |Name Error|
|Yes |Yes |No |Phone Error|
|Yes |Yes |Yes |Creation Successful|

d) State Transition:

Initial State: Empty form.

Transition 1: Fill in name → "Valid Name" State.

Transition 2: Fill in invalid phone number → "Phone Error" State.

e) 

**Título:** [Frontend] Error al guardar cliente con teléfono de 9 dígitos  
**Severidad:** Alta  
**Prioridad:** Alta  
**Pasos para Reproducir:**  
1. Ingresar al formulario de clientes.  
2. Ingresar teléfono de 9 dígitos (ej: 300123456).  
3. Guardar.  

**Resultado Actual:** Mensaje "Cliente creado exitosamente".  
**Resultado Esperado:** Error "El teléfono debe tener 10 dígitos".  
**Evidencias:** Captura de pantalla + logs de consola.  



## 2. Backend: This part can be found in the [#SerenityRest](https://github.com/emproy91/AutoSerenitYRest/tree/main/SerenityRest) folder, where you'll find the readme with the description.

## 3. Evidence:

a) You may be interested in my [#JMeter](https://github.com/emproy91/JMPerformance) repo with #Performance tests.

b) You may be interested in my [#PlayWright](https://github.com/emproy91/PlayWrightPOM) repo using the #POM methodology.

c) Evidence of git flow up to the first production commit is located in the [#GITFLOW](https://github.com/emproy91/AutoSerenitYRest/tree/main/GITFLOW) folder next to this readme.MD

d) To see the collection of [#Postman click here](https://github.com/emproy91/AutoSerenitYRest/blob/main/SerenityRest/reqres.in.postman_collection.json)

**Note**: Two AIs were used in this challenge: Gemini and Deepseek