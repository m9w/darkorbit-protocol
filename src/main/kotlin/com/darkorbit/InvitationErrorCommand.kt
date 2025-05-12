package com.darkorbit

interface InvitationErrorCommand : ProtocolPacket {
	var candidateId: Int
	var error: InvitationErrorCommandErrorType
	var inviterId: Int
}
