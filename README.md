# Types de tests

Il existe de nombreux types de tests dans le domaine du génie logiciel, chacun ayant un objectif spécifique et
s'appliquant à différentes étapes du cycle de développement. Voici une liste non exhaustive des types de tests les plus
courants:

* **Exemples de frameworks :** JUnit, NUnit, PHPUnit, RSpec, Mocha, Jest, Jasmine, Karma, etc.
* **Exemples de bibliothèques :** Mockito, Sinon, etc.

## Unitaire (Unit Testing)

* **Définition :** Teste les plus petites parties d'une application isolément (sans dépendances externes, souvent avec
  des mocks/stubs).
* **Exemple :** Si vous avez une fonction qui prend deux nombres et les additionne, vous pouvez écrire un test unitaire
  pour vérifier que la fonction renvoie le résultat correct pour un ensemble de valeurs d'entrée.
* **Avantages :** Les tests unitaires sont rapides à écrire et à exécuter, et ils peuvent être utilisés pour tester des
  parties du code qui sont difficiles à tester par d'autres moyens.
* **Inconvénients :** Les tests unitaires ne peuvent pas tester les interactions entre les différentes parties d'une
  application, et ils ne peuvent pas tester les aspects non fonctionnels comme la performance ou la sécurité.
* **Quand l'utiliser :** Les tests unitaires sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le code qu'ils écrivent fonctionne comme prévu. Ils peuvent également être utilisés
  pour tester des parties du code qui sont difficiles à tester par d'autres moyens, comme les exceptions ou les erreurs
  de réseau.

## Intégration (Integration Testing)

* **Définition :** Teste les interactions entre différentes pièces du logiciel ou entre le logiciel et des systèmes
  externes.
* **Exemple :** Si vous avez une application qui communique avec une base de données, vous pouvez écrire un test
  d'intégration pour vérifier que l'application peut se connecter à la base de données et récupérer des données.
* **Avantages :** Les tests d'intégration peuvent être utilisés pour tester les interactions entre différentes parties
  d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests d'intégration sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests d'intégration sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que les différentes parties d'une application fonctionnent ensemble comme prévu. Ils
  peuvent également être utilisés pour tester des aspects non fonctionnels comme la performance ou la sécurité.

## Système (System Testing)

* **Définition :** Teste le système dans son ensemble pour s'assurer qu'il répond aux exigences spécifiées.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test système pour vérifier que les utilisateurs peuvent s'inscrire et se connecter.
* **Avantages :** Les tests système peuvent être utilisés pour tester les interactions entre différentes parties d'une
  application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests système sont plus lents à écrire et à exécuter que les tests unitaires, et ils peuvent
  être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests système sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le système fonctionne comme prévu. Ils peuvent également être utilisés pour tester
  des aspects non fonctionnels comme la performance ou la sécurité.

## Acceptation (Acceptance Testing)

* **Définition :** S'assure que le système répond aux critères d'acceptation des utilisateurs ou des clients.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test d'acceptation pour vérifier que les utilisateurs peuvent s'inscrire et se connecter.
* **Avantages :** Les tests d'acceptation peuvent être utilisés pour tester les interactions entre différentes parties
  d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests d'acceptation sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests d'acceptation sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le système répond aux critères d'acceptation des utilisateurs ou des clients. Ils
  peuvent également être utilisés pour tester des aspects non fonctionnels comme la performance ou la sécurité.

## Régression (Regression Testing)

* **Définition :** Vérifie qu'un changement récent (par exemple, une nouvelle fonctionnalité ou un correctif) n'a pas
  introduit de nouveaux défauts dans le logiciel existant.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test de régression pour vérifier que les utilisateurs peuvent toujours s'inscrire et se connecter après
  avoir ajouté une nouvelle fonctionnalité.
* **Avantages :** Les tests de régression peuvent être utilisés pour tester les interactions entre différentes parties
  d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests de régression sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests de régression sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer qu'un changement récent n'a pas introduit de nouveaux défauts dans le logiciel existant.
  Ils peuvent également être utilisés pour tester des aspects non fonctionnels comme la performance ou la sécurité.

## Endurance (Endurance Testing)

* **Définition :** Vérifie la capacité du logiciel à maintenir une charge de travail spécifiée pendant une longue
  période.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test d'endurance pour vérifier que les utilisateurs peuvent s'inscrire et se connecter pendant une longue
  période.
* **Avantages :** Les tests d'endurance peuvent être utilisés pour tester les interactions entre différentes parties d'
  une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests d'endurance sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests d'endurance sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le logiciel peut maintenir une charge de travail spécifiée pendant une longue
  période. Ils peuvent également être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.

## Charge (Load Testing)

* **Définition :** Teste la capacité du logiciel à gérer une quantité spécifiée de travail, comme un nombre spécifique
  d'utilisateurs simultanés.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test de charge pour vérifier que les utilisateurs peuvent s'inscrire et se connecter en même temps.
* **Avantages :** Les tests de charge peuvent être utilisés pour tester les interactions entre différentes parties d'une
  application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests de charge sont plus lents à écrire et à exécuter que les tests unitaires, et ils peuvent
  être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests de charge sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le logiciel peut gérer une quantité spécifiée de travail, comme un nombre spécifique
  d'utilisateurs simultanés. Ils peuvent également être utilisés pour tester des aspects non fonctionnels comme la
  performance ou la sécurité.

## Stress (Stress Testing)

* **Définition :** Pousse le logiciel à ses limites pour voir comment il se comporte sous une charge extrême.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test de stress pour vérifier que les utilisateurs peuvent s'inscrire et se connecter sous une charge
  extrême.
* **Avantages :** Les tests de stress peuvent être utilisés pour tester les interactions entre différentes parties d'une
  application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests de stress sont plus lents à écrire et à exécuter que les tests unitaires, et ils peuvent
  être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests de stress sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le logiciel peut gérer une charge extrême. Ils peuvent également être utilisés pour
  tester des aspects non fonctionnels comme la performance ou la sécurité.

## Performance (Performance Testing)

* **Définition :** Mesure les performances du logiciel, comme le temps de réponse ou le débit.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test de performance pour vérifier le temps de réponse de l'application lorsqu'un utilisateur s'inscrit ou se
  connecte.
* **Avantages :** Les tests de performance peuvent être utilisés pour tester les interactions entre différentes parties
  d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests de performance sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests de performance sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le logiciel répond aux exigences de performance. Ils peuvent également être utilisés
  pour tester des aspects non fonctionnels comme la performance ou la sécurité.

## Fonctionnel (Functional Testing)

* **Définition :** Teste des fonctions ou des scénarios spécifiques pour s'assurer qu'ils fonctionnent comme prévu.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test fonctionnel pour vérifier que les utilisateurs peuvent s'inscrire et se connecter.
* **Avantages :** Les tests fonctionnels peuvent être utilisés pour tester les interactions entre différentes parties
  d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests fonctionnels sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests fonctionnels sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le logiciel fonctionne comme prévu. Ils peuvent également être utilisés pour tester
  des aspects non fonctionnels comme la performance ou la sécurité.

## Sécurité (Security Testing)

* **Définition :** Identifie les vulnérabilités du logiciel et évalue sa résistance aux attaques.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test de sécurité pour vérifier que les utilisateurs ne peuvent pas accéder aux données d'autres
  utilisateurs.
* **Avantages :** Les tests de sécurité peuvent être utilisés pour tester les interactions entre différentes parties
  d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests de sécurité sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests de sécurité sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le logiciel est sécurisé. Ils peuvent également être utilisés pour tester des aspects
  non fonctionnels comme la performance ou la sécurité.

## Compatibilité (Compatibility Testing)

* **Définition :** Vérifie que le logiciel fonctionne correctement dans différents environnements, systèmes
  d'exploitation, navigateurs, etc.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  écrire un test de compatibilité pour vérifier que l'application fonctionne correctement sur différents systèmes d'
  exploitation et navigateurs.
* **Avantages :** Les tests de compatibilité peuvent être utilisés pour tester les interactions entre différentes
  parties d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance
  ou la sécurité.
* **Inconvénients :** Les tests de compatibilité sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests de compatibilité sont généralement écrits par les développeurs pendant la phase de
  développement pour s'assurer que le logiciel fonctionne correctement dans différents environnements, systèmes
  d'exploitation, navigateurs, etc. Ils peuvent également être utilisés pour tester des aspects non fonctionnels comme
  la performance ou la sécurité.

## Exploratoire (Exploratory Testing)

* **Définition :** Les testeurs explorent l'application sans scripts pré-définis, souvent utilisés pour identifier de
  nouveaux bugs ou pour comprendre le comportement du système.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  demander à un testeur d'explorer l'application pour voir si elle fonctionne comme prévu.
* **Avantages :** Les tests exploratoires peuvent être utilisés pour tester les interactions entre différentes parties
  d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests exploratoires sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests exploratoires sont généralement effectués par des testeurs pendant la phase de test
  pour identifier de nouveaux bugs ou pour comprendre le comportement du système. Ils peuvent également être utilisés
  pour tester des aspects non fonctionnels comme la performance ou la sécurité.

## Usabilité (Usability Testing)

* **Définition :** Évalue à quel point l'application est conviviale et intuitive pour les utilisateurs.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  demander à un testeur d'essayer de s'inscrire et de se connecter pour voir si l'application est conviviale et
  intuitive.
* **Avantages :** Les tests d'utilisabilité peuvent être utilisés pour tester les interactions entre différentes parties
  d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests d'utilisabilité sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests d'utilisabilité sont généralement effectués par des testeurs pendant la phase de test
  pour évaluer à quel point l'application est conviviale et intuitive pour les utilisateurs. Ils peuvent également être
  utilisés pour tester des aspects non fonctionnels comme la performance ou la sécurité.

## Alpha et Beta Testing

* **Définition :** Alpha se déroule généralement en interne avant de sortir le logiciel au public, tandis que le Beta
  testing implique de donner un accès anticipé à un groupe restreint d'utilisateurs externes pour recueillir leurs
  commentaires.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  demander à un groupe restreint d'utilisateurs de tester l'application avant de la sortir au public.
* **Avantages :** Les tests Alpha et Beta peuvent être utilisés pour tester les interactions entre différentes parties
  d'une application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests Alpha et Beta sont plus lents à écrire et à exécuter que les tests unitaires, et ils
  peuvent être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests Alpha et Beta sont généralement effectués par des testeurs pendant la phase de test
  pour recueillir les commentaires des utilisateurs avant de sortir le logiciel au public. Ils peuvent également être
  utilisés pour tester des aspects non fonctionnels comme la performance ou la sécurité.

## Smoke (Smoke Testing)

* **Définition :** Effectue un ensemble basique de tests pour s'assurer que les fonctions principales du logiciel
  fonctionnent avant de procéder à des tests plus approfondis.
* **Exemple :** Si vous avez une application qui permet aux utilisateurs de s'inscrire et de se connecter, vous pouvez
  demander à un testeur de s'inscrire et de se connecter pour s'assurer que ces fonctions fonctionnent avant de procéder
  à des tests plus approfondis.
* **Avantages :** Les tests de fumée peuvent être utilisés pour tester les interactions entre différentes parties d'une
  application, et ils peuvent être utilisés pour tester des aspects non fonctionnels comme la performance ou la
  sécurité.
* **Inconvénients :** Les tests de fumée sont plus lents à écrire et à exécuter que les tests unitaires, et ils peuvent
  être difficiles à déboguer lorsqu'ils échouent.
* **Quand l'utiliser :** Les tests de fumée sont généralement effectués par des testeurs pendant la phase de test pour
  s'assurer que les fonctions principales du logiciel fonctionnent avant de procéder à des tests plus approfondis. Ils
  peuvent également être utilisés pour tester des aspects non fonctionnels comme la performance ou la sécurité.

## Sanity (Sanity Testing)

Vérifie que des fonctionnalités ou des corrections spécifiques fonctionnent comme prévu, généralement après une petite
modification ou un correctif.

# Type de bouchonnage

## Dummy

* **Définition :** Un objet utilisé principalement pour remplir les dépendances d'un autre objet mais qui n'est jamais
  vraiment utilisé. Il est là uniquement pour permettre à la classe conteneur de fonctionner et d'être testée.
* **Exemple :** Si vous avez besoin de fournir un paramètre de constructeur mais que vous n'avez pas l'intention de
  l'utiliser lors de vos tests, vous fourniriez un objet "dummy".

## Fake

* **Définition :** Une implémentation de production qui prend des raccourcis pour rendre le système opérationnel. Elle
  est utilisée pour tester d'autres parties du système sans avoir à utiliser la véritable implémentation, qui peut être
  coûteuse ou difficile à mettre en œuvre.
* **Exemple :** Si vous avez une base de données, une version "fake" pourrait utiliser la mémoire (par exemple une
  simple liste) pour stocker des données au lieu d'une véritable base de données.

## Stub

* **Définition :** Une version contrôlée d'un objet qui renvoie des réponses prédéfinies, indépendamment de ce qui est
  passé en paramètre. Souvent utilisé pour simuler des scénarios spécifiques lors des tests.
* **Exemple :** Si vous avez un service qui fait appel à une API externe pour obtenir des taux de change, un "stub" de
  ce service pourrait toujours renvoyer un taux de change fixe, indépendamment de la paire de devises fournie.

## Mock

* **Définition :** Un objet qui simule le comportement d'un objet réel de manière contrôlée. Un mock est configuré pour
  renvoyer des valeurs spécifiques en réponse à certaines méthodes appelées, et vous pouvez également vérifier que
  certaines méthodes ont été appelées (ou non) et combien de fois.
* **Exemple :** Si vous voulez vous assurer qu'une méthode particulière a été appelée (ou n'a pas été appelée) avec
  certains arguments et un certain nombre de fois lors du test, vous utiliseriez un "mock".

## Spy

* **Définition :** Un enveloppement autour d'un objet réel qui permet de suivre les appels sur cet objet et, si
  nécessaire, de substituer certains comportements. Contrairement au mock, il ne remplace pas l'objet, mais observe (
  espionne) ses interactions.
* **Exemple :** Si vous voulez utiliser un vrai service mais aussi vérifier combien de fois une méthode particulière a
  été appelée sur ce service pendant le test, vous utiliseriez un "spy".

# TDD (Test Driven Development)

**Définition**

Le Test-Driven Development (TDD) est une méthodologie de développement de logiciel où l'écriture du test précède celle
du code source. Dans le TDD, le cycle de développement est typiquement constitué des étapes suivantes : écrire un test
qui échoue, écrire le code source minimal pour que le test réussisse, puis refactorer ce code pour des améliorations
tout en s'assurant que le test passe toujours.

Supposons que vous vouliez développer une fonction qui ajoute deux nombres. Voici comment cela pourrait être fait avec
TDD :

**1- Écrivez d'abord le test**

```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }
}
```

À ce stade, la classe Calculator et la méthode add n'existent pas encore, donc le test échouera à la compilation.

**2- Écrivez le code minimal pour faire passer le test**

```java
public class Calculator {
  public int add(int a, int b) {
    return 0;  // Retourne uniquement 0 pour le moment.
  }
}
```

Le test échouera à l'exécution car la méthode add ne fait pas encore la somme.

**3- Améliorez le code pour faire passer le test**
```java
public class Calculator {
  public int add(int a, int b) {
    return a + b;
  }
}
```
Maintenant, le test passera car la méthode add renvoie le bon résultat.

**4- Refactorisation (si nécessaire)**
Si le code a besoin d'être organisé ou amélioré pour des raisons de performance, de lisibilité, etc., cela est fait à
cette étape. Après toute refactorisation, le test doit toujours passer.

En résumé, TDD encourage à écrire d'abord les tests pour définir ce à quoi le comportement du code devrait ressembler,
puis à écrire le code pour satisfaire ces tests, assurant ainsi que le code fonctionne comme prévu.

# BDD (Behavior Driven Development)
**Définition**
Le Behavior-Driven Development (BDD) est une approche de développement qui étend le TDD (Test-Driven Development) en mettant l'accent sur le comportement d'une application du point de vue de l'utilisateur final. Dans le BDD, les scénarios sont écrits dans un langage naturel et compréhensible par toutes les parties prenantes du projet (développeurs, testeurs, responsables produits, etc.). Ces scénarios sont ensuite traduits en tests automatiques.

Prenons l'exemple d'une fonctionnalité de connexion sur un site web. Voici comment cela pourrait être représenté en BDD en utilisant l'outil Cucumber, qui est populaire pour le BDD.

**1- Écrivez d'abord le scénario en langage naturel (Gherkin)**
```gherkin
Feature: Connexion au site web

  Scenario: Connexion réussie avec des identifiants valides
    Given l'utilisateur est sur la page de connexion
    When l'utilisateur entre un "username" valide et un "password" valide
    Then l'utilisateur est redirigé vers la page d'accueil

  Scenario: Échec de la connexion avec un mot de passe incorrect
    Given l'utilisateur est sur la page de connexion
    When l'utilisateur entre un "username" valide et un "password" incorrect
    Then un message d'erreur est affiché
```

**2- Traduisez le scénario en tests automatisés**
Avec Cucumber et Java, les étapes (Given, When, Then) sont traduites en fonctions
```java
public class StepDefinitions {

  @Given("l'utilisateur est sur la page de connexion")
  public void theUserIsOnLoginPage() {
    // Code pour naviguer vers la page de connexion
  }

  @When("l'utilisateur entre un {string} valide et un {string} valide")
  public void userEntersValidCredentials(String username, String password) {
    // Code pour entrer les identifiants et soumettre le formulaire
  }

  @Then("l'utilisateur est redirigé vers la page d'accueil")
  public void userIsRedirectedToHomePage() {
    // Vérifiez que l'utilisateur est bien sur la page d'accueil
  }

  // ... et ainsi de suite pour les autres étapes
}
```


En résumé, BDD encourage à définir le comportement de l'application en termes d'interactions utilisateur et d'obtenir une compréhension commune entre les parties prenantes sur ce comportement attendu. Les scénarios BDD aident à assurer que le logiciel développé correspond véritablement aux besoins et attentes des utilisateurs.

# Spring-boot
**1- Modèle Person**
```java
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    // getters, setters, constructors
}
```

**2- Repository Person**
```java
public interface PersonRepository extends JpaRepository<Person, Long> {
}
```

**3- Service Person**
```java
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    // d'autres méthodes si nécessaires
}
```

**4- Contrôleur Person**
```java
@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    // d'autres endpoints si nécessaires
}
```

**5- Configuration de la base de données h2**
```properties
spring.datasource.url=jdbc:h2:mem:persondb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

**6- Test du Service**
```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {
    @MockBean
    private PersonRepository personRepository;

    @Autowired
    private PersonService personService;

    @Test
    public void testGetAllPersons() {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        when(personRepository.findAll()).thenReturn(Collections.singletonList(person));

        List<Person> persons = personService.getAllPersons();
        assertEquals(1, persons.size());
        assertEquals(person, persons.get(0));
    }

    // D'autres tests pour d'autres méthodes
}
```

**7- Test du Contrôleur**
```java
@RunWith(SpringRunner.class)
@WebMvcTest(PersonController.class)
public class PersonControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonService personService;

    @Test
    public void testGetAllPersons() throws Exception {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        when(personService.getAllPersons()).thenReturn(Collections.singletonList(person));

        mockMvc.perform(get("/persons"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$", hasSize(1)))
               .andExpect(jsonPath("$[0].name", is(person.getName())))
               .andExpect(jsonPath("$[0].age", is(person.getAge())));
    }

    // D'autres tests pour d'autres endpoints
}
```

Les dépendances nécessaires pour ces tests sont spring-boot-starter-test, mockito-core, et spring-boot-starter-data-jpa.

