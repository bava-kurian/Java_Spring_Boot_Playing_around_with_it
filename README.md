
# 📘 Spring Boot Annotations Cheat Sheet

A quick reference guide for commonly used Spring and Spring Boot annotations.

## 🔧 Core Annotations

| Annotation                 | Description                                                                                                                       |
| -------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `@SpringBootApplication`   | Indicates a configuration class that declares one or more `@Bean` methods and triggers auto-configuration and component scanning. |
| `@Configuration`           | Indicates that a class declares one or more `@Bean` methods to be processed by the Spring container.                              |
| `@Bean`                    | Marks a method to produce a bean to be managed by the Spring container.                                                           |
| `@Component`               | Indicates that a class is a Spring-managed component.                                                                             |
| `@Service`                 | Specialization of `@Component` for service-layer classes.                                                                         |
| `@Repository`              | Specialization of `@Component` for persistence-layer classes (DAO).                                                               |
| `@Autowired`               | Allows Spring to resolve and inject collaborating beans into the component.                                                       |
| `@Value`                   | Injects values into fields from a properties file or expression.                                                                  |
| `@PropertySource`          | Declares a property source to be added to Spring’s environment.                                                                   |
| `@EnableAutoConfiguration` | Enables Spring Boot’s auto-configuration mechanism.                                                                               |

## 🌐 Web & REST API Annotations

| Annotation        | Description                                                              |
| ----------------- | ------------------------------------------------------------------------ |
| `@RestController` | Combines `@Controller` and `@ResponseBody` to simplify RESTful services. |
| `@RequestMapping` | Maps HTTP requests to handler methods or classes.                        |
| `@GetMapping`     | Shortcut for `@RequestMapping(method = RequestMethod.GET)`.              |
| `@PostMapping`    | Shortcut for `@RequestMapping(method = RequestMethod.POST)`.             |
| `@PutMapping`     | Shortcut for `@RequestMapping(method = RequestMethod.PUT)`.              |
| `@DeleteMapping`  | Shortcut for `@RequestMapping(method = RequestMethod.DELETE)`.           |
| `@PatchMapping`   | Shortcut for `@RequestMapping(method = RequestMethod.PATCH)`.            |
