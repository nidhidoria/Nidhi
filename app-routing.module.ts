import { Component, NgModule } from '@angular/core';
import { flush } from '@angular/core/testing';
import { RouterModule, Routes } from '@angular/router';
import { AboutCompanyComponent } from './about-us/about-company/about-company.component';
import { AboutEmployeesComponent } from './about-us/about-employees/about-employees.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { AccountComponent } from './project_admin/account/account.component';
import { AdminApproveComponent } from './project_admin/admin-approve/admin-approve.component';
import { AdminHomeComponent } from './project_admin/admin-home/admin-home.component';
import { ApprejectComponent } from './project_admin/appreject/appreject.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
//  {path:'',redirectTo:'/contactus' , pathMatch:'full'},
{path:'login',component:LoginComponent},
{path:'dashboard',component:DashboardComponent},
{path:'register',component:RegisterComponent},
{path:'register',component:RegisterComponent},
{path:'adminapprove/:id',component:AdminApproveComponent},
{path:'accountcreation/:appid',component:AccountComponent},
{path:'applicantreject/:rejectid',component:ApprejectComponent},
{path:'adminhome',component:AdminHomeComponent},
{path:'aboutus',
    children: [
      {path:'',component:AboutUsComponent},
      {path:'about-emp', component: AboutEmployeesComponent},
      {path:'about-cmp', component: AboutCompanyComponent},
    ]
},

{path:'contactus',component:ContactUsComponent},
// {path:'**',component:PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
