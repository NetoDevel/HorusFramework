package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.CountryBO;

import com.horusframework.facade.HorusRESTFullInterface;

public class Country implements HorusRESTFullInterface {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response, String[] uri) {
		CountryBO.getList(request, response, uri);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response, String[] uri) {
		// TODO Auto-generated method stub
	}

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response, String[] uri) {
		// TODO Auto-generated method stub
	}

	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response, String[] uri) {
		// TODO Auto-generated method stub
	}

}