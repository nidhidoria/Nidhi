import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { MainbodyComponent } from './mainbody/mainbody.component';
import { MenubarComponent } from './menubar/menubar.component';
import { SimpleInterestComponent } from './simple-interest/simple-interest.component';
import { FormsModule } from '@angular/forms';
import { EmiCalculatorComponent } from './emi-calculator/emi-calculator.component';

import { AddPayeeComponent } from './add-payee/add-payee.component';
import { ApplicantComponent } from './applicant/applicant.component';
import { TransferModule } from './transfer/transfer.module';
import { CalculatorComponent } from './calculator/calculator.component';
import { CurrencyConverterComponent } from './currency-converter/currency-converter.component';
import { HttpClientModule } from '@angular/common/http';
import { UserDetailsComponent } from './user-details/user-details.component';
import { NewapplicantComponent } from './newapplicant/newapplicant.component';
import { ApplyComponent } from './apply/apply.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutUsComponent } from './about-us/about-us.component';

import { AboutEmployeesComponent } from './about-us/about-employees/about-employees.component';
import { AboutCompanyComponent } from './about-us/about-company/about-company.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HomeComponent } from './home/home.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AdminHomeComponent } from './project_admin/admin-home/admin-home.component';
import { AdminApproveComponent } from './project_admin/admin-approve/admin-approve.component';
import { AccountComponent } from './project_admin/account/account.component';
import { ApprejectComponent } from './project_admin/appreject/appreject.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MainbodyComponent,
    MenubarComponent,
    SimpleInterestComponent,
    EmiCalculatorComponent,
 
    AddPayeeComponent,
      ApplicantComponent,
      CalculatorComponent,
      CurrencyConverterComponent,
      UserDetailsComponent,
      NewapplicantComponent,
      ApplyComponent,
      LoginComponent,
      RegisterComponent,
      ContactUsComponent,
      AboutUsComponent,
      AboutCompanyComponent,
      AboutEmployeesComponent,
      PageNotFoundComponent,
      HomeComponent,
      DashboardComponent,
      AdminHomeComponent,
      AdminApproveComponent,
      AccountComponent,
      ApprejectComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    TransferModule,
    HttpClientModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
