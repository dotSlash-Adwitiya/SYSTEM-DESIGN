import java.util.List;

public class AdapterPattern {
  // * USECASE: When new functionality is to be used without modifying the existing infrastructure
  // * We used Adapter Pattern so new functionality can be easily integrateed (or adapt to) the
  // * Existing infrastructure.
  // * Example: DispatcherServlet Spring old version only had : HandlerMapping for Finding method
  // * Later spring versions introduced New way to write an endpoint :
  // * Earlier Version : public ModelAndView handleRequest(...) {}
  // * Later Version : @GetMapping("/users")
  // * public List<User> getUsers() {}
}