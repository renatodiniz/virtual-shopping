package com.vs.ps.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Api(value = "createVendor", description = "the createVendor API")
public interface CreateVendorApi {

	@ApiOperation(value = "Create Vendor", notes = "Create Vendor", response = Integer.class, tags = { "Product", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Vendor Created", response = Integer.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Integer.class) })
	@RequestMapping(value = "/createVendor", produces = { "application/json" }, method = RequestMethod.PUT)
	ResponseEntity<Integer> createVendorPut(
			@ApiParam(value = "Create Vendor with Name", required = true) @RequestParam(value = "vendorName", required = true) String vendorName

	);

}
