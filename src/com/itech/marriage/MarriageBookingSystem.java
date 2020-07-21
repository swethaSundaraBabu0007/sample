package com.itech.marriage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MarriageBookingSystem {
	private List<Applicant> applicantList = new ArrayList<Applicant>();

	public boolean addApplicant(Applicant a)
    {
        long count=applicantList.stream().map(Applicant :: getApplicantId).filter(i->i==a.getApplicantId()).count();
        if(count!=0)
            return false;
        applicantList.add(a);
        return true;
    }

	public List<Applicant> findMatch(Applicant a)throws ApplicantNotFound
    {
        List<Applicant> applicantList1=applicantList.stream()
                .filter(s -> !s.getSex().equals(a.getSex()) && s.getAge() >= a.getAge()).collect(toList());
        if(applicantList1.isEmpty())
            throw new ApplicantNotFound();
        return applicantList1;
    }

	public boolean assignApplicant(int applicantId,Applicant a)
    {
        Applicant la = applicantList.stream()
                .filter(k -> k.getApplicantId() == applicantId).findAny().get();
        if (la.getApplicantId() != applicantId)
            return false;
        la.setPartner(a);a.setPartner(la);
        return true;

    }

	public boolean dropProposal(int applicantId)
    {
        Applicant ta=applicantList.stream()
                .filter(k -> k.getApplicantId()==applicantId).findAny().get();
        if(ta.getApplicantId()!=applicantId)
            return false;
Applicant a= (Applicant) ta.getPartner();a.setPartner(null);
        ta.setPartner(null);
        return true;
    }

	public Map<String,Integer> findApplicantSummary()
    {List<Applicant> singles=applicantList.stream()
            .filter(p -> p.getPartner() == null).collect(Collectors.toList());

        Collections.sort(singles,(a,b) -> (a.getSex().compareTo(b.getSex())));
        Map<String,Integer> info=new TreeMap<>();
        for(Applicant single:singles)
            info.put(single.getName(),single.getApplicantId());
        return info;
    }
}

