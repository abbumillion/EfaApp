package com.app.efa.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class CustomerModel extends UserModel{
    private long customerId;
    private List<JobModel> jobModel;
}
