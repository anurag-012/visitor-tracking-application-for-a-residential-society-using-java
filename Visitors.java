public class Visitor {
// 0 is for unapproved
// 1 is for approved
// 2 is for pending
private int visitorId, approvalState; private String visitorName;

public Visitor(int id, String name) { visitorId = id;
visitorName = name; approvalState = 0;
}

public void setApprovalState(int approval) { approvalState = approval;
}

public int getVisitorId() { return visitorId;
}

public String getVisitorName() { return visitorName;
}
}
