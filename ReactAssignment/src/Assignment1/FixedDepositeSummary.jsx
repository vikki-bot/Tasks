import React, { useState } from 'react';
import '../Assignmentcommon.css'; // Import the common style
import FixedDepositSummaryCard from './FixedDepositeSummarycard';
import RDContributionTracker from './RDContrubution';
import CustomerProfile from './CustomerProfile';

export default function FixedDepositSummary() {
  const [view, setView] = useState('fd'); // default to FD view

  return (
    <div className="assignment-section">
      <h2>Assignment 1: Investment Components</h2>

      <div className="assignment-card">
        <div className="assignment-buttons-vertical">
          <button className="assignment-button" onClick={() => setView('fd')}>
            Fixed Deposit
          </button>
          <button className="assignment-button" onClick={() => setView('rd')}>
            RD Tracker
          </button>
          <button className="assignment-button" onClick={() => setView('profile')}>
            Investment Profile
          </button>
        </div>
      </div>

      {view === 'fd' && (
        <FixedDepositSummaryCard
          depositAmount={100000}
          interestRate={6.5}
          tenure={24}
          maturityAmount={114000}
        />
      )}

      {view === 'rd' && (
        <RDContributionTracker initialContribution={2000} tenure={12} />
      )}

      {view === 'profile' && (
        <CustomerProfile
          name="Vikas Gouda"
          totalFDs={120000}
          totalRDs={30000}
          totalInvestment={150000}
        />
      )}
    </div>
  );
}
