package peaksoft.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.model.Company;
import peaksoft.service.CompanyService;

@Controller
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompanyApi {

    private final CompanyService companyService;

    @GetMapping()
    public String getAllCompanies(Model model) {
        model.addAttribute("companies", companyService.getAllCompanies());
        return "mainPage";
    }


    @GetMapping("/new")
    public String createCompany(Model model) {
        model.addAttribute("newCompany", new Company());
        return "newCompany";
    }

    @PostMapping("/save")
    public String saveCompany(@ModelAttribute("newCompany") Company company) {
        companyService.saveCompany(company);
        return "redirect:/companies";
    }

    @DeleteMapping("/{id}/delete")
    public String deleteCompany(@PathVariable("id") Long id){
        companyService.deleteCompany(id);
        return "redirect:/companies";
    }
















}















