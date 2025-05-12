package com.darkorbit

enum class InvitationErrorCommandErrorType {
	/* 0 */ GROUP_FULL,
	/* 1 */ CANDIDATE_IN_GROUP,
	/* 2 */ CANDIDATE_NONEXISTENT,
	/* 3 */ INVITER_NONEXISTENT,
	/* 4 */ NO_INVITATION,
	/* 5 */ BOSS_ONLY,
	/* 6 */ MAX_INVITATIONS_INVITER,
	/* 7 */ MAX_INVITATIONS_CANDIDATE,
	/* 8 */ CANDIDATE_BLOCKING,
	/* 9 */ DUPLICATE_INVITATION,
}
