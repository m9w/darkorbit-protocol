package com.darkorbit

enum class RecallBattlePassMissionRefreshResultCommandResult {
	/* 0 */ SUCCESS,
	/* 1 */ INACTIVE,
	/* 2 */ STALE_ACTIVITY,
	/* 3 */ STALE_MISSION,
	/* 4 */ INVALID_REQUEST,
	/* 5 */ NO_FREE_REFRESH,
	/* 6 */ USE_FREE_REFRESH_FIRST,
	/* 7 */ INSUFFICIENT_URIDIUM,
	/* 8 */ PRICE_CHANGED,
	/* 9 */ NO_REPLACEMENT,
	/* 10 */ SERVER_ERROR,
}
